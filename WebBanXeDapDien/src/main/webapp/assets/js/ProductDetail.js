jQuery(document).ready(function () {


    jQuery("#form_cart").submit(function (e) {
        e.preventDefault();
    });

    jQuery('#btn-submit-cart').click(function (e) {
        e.preventDefault();
        var color = jQuery("#color option:selected").val();
        var productId = jQuery("input[name=product_id]").val();
        var quantity = jQuery("input[name=quantity]").val();
        var urlImage = jQuery("#mainImage").attr("data-images");
        var productPrice = jQuery("#amount").attr("data-value");

        var productName = jQuery("#productName").text();

        console.log(color + ' ' + productId + ' ' + quantity + ' ' + urlImage + ' ' + productPrice + ' ' + productName);

        jQuery.ajax({
            url: '/addcart',
            type: 'post',
            data: {
                productColor: color,
                productId: productId,
                quantity: quantity,
                urlImage: urlImage,
                productPrice: productPrice,
                productName: productName
            },
            success: function (data) {
                jQuery('.mini_cart_item').remove();
                if (data != null) {
                    jQuery('#countProduct').text(data.length);
                }
                for (var i = 0; i < data.length; i++) {
                    var value = parseInt(data[i].productPrice);
                    var price = value.toFixed(0).replace(/(\d)(?=(\d\d\d)+(?!\d))/g, "$1,") + ' VND';
                    jQuery('.cart_list').append('<li ' + 'data-id="' + data[i].productId + '" class="mini_cart_item" ' + 'data-color="' + data[i].productColor + '"' + '><a id="abc" title="Remove this item" style="cursor: pointer" class="remove" >×</a><a href="single-product.html"><img class="attachment-shop_thumbnail size-shop_thumbnail wp-post-image"src="/assets/images/products/' + data[i].urlImage + '" alt="">' + data[i].productName + '&nbsp;</a><span class="quantity">' + data[i].quantity + ' ' + data[i].productColor + '× <span class="amount">' + price + '</span></span></li>');
                }

            },
            dataType: "json"

        })
    });

    jQuery(document).on('click', '.remove', function () {
        var elment = jQuery(this).parent();
        var productId = elment.attr('data-id');
        var productColor = elment.attr('data-color');

        jQuery.ajax({
            url: '/deletecart',
            type: 'post',
            data: {
                productColor: productColor,
                productId: productId,
            },
            success: function (data) {
                alert(data);
               if(data == true) {
                  var count = jQuery('#countProduct').text();
                  count -= 1;
                   jQuery('#countProduct').text(count);
                   elment.hide();
               }else {
                   console.log("xoa khong thanh cong")
               }
            },
            dataType: "json"

        })

    });


});
