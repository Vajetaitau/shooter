(function() {

    $(document).ready(function() {
        console.log('ready');
        appendLoginFormToBody();
    });

    function appendLoginFormToBody() {
        $.get("/guest/templates/login.html", function(data){
            $('#loginWrapper').html(data);
            getCsrfToken(function(csrf) {
                $('#loginForm').append(
                    $('<input type="hidden">')
                        .attr('name', csrf.parameterName)
                        .val(csrf.token)
                );
            });
        });
    };

    function getCsrfToken(successCallback) {
        $.get('/csrf', successCallback);
    };

})();