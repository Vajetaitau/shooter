var $shooterController = {};

(function() {

    $shooterController.saveShooter = function(shooterDetails) {
        $csrfController.getCsrf(function(csrf) {
            var headers = {
                'X-CSRF-TOKEN': csrf.token
            };

            var postObject = {
                url: '/action/shooter',
                dataType: 'json',
                contentType:"application/json; charset=utf-8",
                headers: headers,
                data: JSON.stringify(shooterDetails)
            };

            return $.post(postObject);
        });
    }

})();