$csrfController = {};

(function() {

    var csrf;

    $csrfController.getCsrf = function(successCallback) {
        if (csrf) {
            successCallback(csrf);
        } else {
            $.get('/csrf', function(response) {
                csrf = {
                    parameterName: response.parameterName,
                    headerName: response.headerName,
                    token: response.token
                };
                successCallback(csrf);
            });
        }
    }

})();