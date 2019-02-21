jQuery(document).ready(function ($) {
    'use strict';

    // ============================================================== 
    // Notification list
    // ============================================================== 
    if ($(".notification-list").length) {

        $('.notification-list').slimScroll({
            height: '250px'
        });

    }

    // ============================================================== 
    // Menu Slim Scroll List
    // ============================================================== 


    if ($(".menu-list").length) {
        $('.menu-list').slimScroll({});
    }

    // ============================================================== 
    // Sidebar scrollnavigation 
    // ============================================================== 

    if ($(".sidebar-nav-fixed a").length) {
        $('.sidebar-nav-fixed a')
        // Remove links that don't actually link to anything

            .click(function (event) {
                // On-page links
                if (
                    location.pathname.replace(/^\//, '') == this.pathname.replace(/^\//, '') &&
                    location.hostname == this.hostname
                ) {
                    // Figure out element to scroll to
                    var target = $(this.hash);
                    target = target.length ? target : $('[name=' + this.hash.slice(1) + ']');
                    // Does a scroll target exist?
                    if (target.length) {
                        // Only prevent default if animation is actually gonna happen
                        event.preventDefault();
                        $('html, body').animate({
                            scrollTop: target.offset().top - 90
                        }, 1000, function () {
                            // Callback after animation
                            // Must change focus!
                            var $target = $(target);
                            $target.focus();
                            if ($target.is(":focus")) { // Checking if the target was focused
                                return false;
                            } else {
                                $target.attr('tabindex', '-1'); // Adding tabindex for elements not focusable
                                $target.focus(); // Set focus again
                            }
                            ;
                        });
                    }
                }
                ;
                $('.sidebar-nav-fixed a').each(function () {
                    $(this).removeClass('active');
                })
                $(this).addClass('active');
            });

    }

    // ============================================================== 
    // tooltip
    // ============================================================== 
    if ($('[data-toggle="tooltip"]').length) {

        $('[data-toggle="tooltip"]').tooltip()

    }

    // ==============================================================
    // popover
    // ============================================================== 
    if ($('[data-toggle="popover"]').length) {
        $('[data-toggle="popover"]').popover()

    }
    // ==============================================================
    // Chat List Slim Scroll
    // ============================================================== 


    if ($('.chat-list').length) {
        $('.chat-list').slimScroll({
            color: 'false',
            width: '100%'


        });
    }

    $('body').on('change', '.checkBoxStatus', function () {

        var ch = "chưa xác nhận";
        var idOrder = $(this).attr('data-id');
        if (this.checked)
            ch = "xác nhận";
        $.ajax({
            url: '/admin/orders/update',
            type: 'post',
            data: {
                id: idOrder,
                status: ch
            },
            success: function (data) {
                alert("Đa update hóa đơn");

            },
            dataType: "json"

        })
    });

    $('#themsanpham').click(function () {
        $('#file').click();
    });

    $('#file').change(function (event) {

        var files = event.target.files;
        var singedFile = files[0].name;
        console.log(singedFile);
        var forms = new FormData();
        forms.append('file', files[0]);

        $.ajax({
            url: '/admin/products/create',
            type: 'Post',
            data: forms,
            contentType: false,
            processData: false,
            enctype: "multipart/form-data",
            success: function (data) {

                if (data == true) {
                    alert("Đã thêm danh sách sản phẩm thành công");
                } else
                    alert("Thêm sản phẩm thất bại");
            }
        });
    });

    $('#updateSanPham').click(function (e) {

        e.preventDefault();


        console.log($('#formupdate').serialize());

        $.ajax({
            url: '/admin/products/update',
            type: 'Post',
            data:
                $('#formupdate').serialize(),
            success: function (data) {
                if (data == true)
                    alert("Đã cập nhật sản phẩm thành công")
            }
        });
    });

    $('.changeImage').click(function () {
        var btn = $(this);
        var idImage = btn.attr('data-id');
        btn.parent().find("input[data-id=" + idImage + "]").click();
    });

    $('.fileImages').change(function () {

    });

    $('#mainPhoto').change(function () {
        $('#mainImage').attr('src', $(this).val());
    });

    function loadRevenue() {

        $.ajax({
            url: '/admin/revenue',
            type: 'get',
            success: function (data) {
                new Chartist.Line('#myChart', {
                    labels: ['Tháng 1', 'Tháng 2', 'Tháng 3', 'Tháng 4', 'Tháng 5', 'Tháng 6', 'Tháng 7', 'Tháng 8', 'Tháng 9', 'Tháng 10', 'Tháng 11', 'Tháng 12'],
                    series: [
                        data
                    ]
                }, {
                    fullWidth: true,
                    chartPadding: {
                        right: 40
                    }
                });
            },
            dataType: "json"
        });
    }

    loadRevenue();

});

