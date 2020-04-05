$(document).ready(function(){
    loadData(0);
});

function loadData(page) {
    $("#data > tbody").empty();

    $.getJSON('/products?page=' + page, function(data) {
        var i;

        for (i = 0; i < data.length; i++) {
            $('#data > tbody:last-child').append(
                $('<tr>')
                    .append(
                        $('<td>').append(
                            $('<input>').attr('type', 'checkbox').attr('value', data[i].productId)
                        )
                    )
                    .append($('<td>').append(data[i].name))
                    .append($('<td>').append(data[i].brendId))
                    .append($('<td>').append(data[i].categoryId))
                    .append($('<td>').append(data[i].price))
                    .append($('<td>').append(data[i].prodDescr))


            );
        }
    });
}
