jQuery(document).ready(function () {



    jQuery("#form_cart").submit(function (e) {
        e.preventDefault();
    });

    jQuery('#btn-submit-cart').click(function (e) {
        e.preventDefault();
        alert('color' + jQuery("#color option:selected").val() +
            '\n id : ' + jQuery("input[name=product_id]").val() +
            '\n amount: ' + jQuery("input[name=quantity]").val()
        );
    })

});
