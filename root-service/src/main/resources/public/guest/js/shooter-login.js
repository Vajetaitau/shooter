var $shooterLogin = {};

(function() {

    $shooterLogin.showLoginForm = function() {
        $(body).append(
            $('<div></div>').addClass('loginFormWrapper').append(
                $('<form></form>').addClass('loginForm').append()
            )
        );
    };



})();