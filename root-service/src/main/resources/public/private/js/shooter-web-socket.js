var $shooterSocket = {};

(function() {

    var stompClient = null;

    $shooterSocket.connect = function(successCallback, errorCallback) {
        var socket = new SockJS('/gs-guide-websocket');
        stompClient = Stomp.over(socket);
        return stompClient.connect({}, successCallback, errorCallback);
    };

    $shooterSocket.subscribe = function(successCallback, errorCallback) {
        if (stompClient != null) {
            stompClient.subscribe('/topic/greetings', successCallback, errorCallback);
        }
    };

    $shooterSocket.move = function(movementEnum) {/* UP, DOWN, LEFT, RIGHT */
        if (stompClient != null) {
            stompClient.send("/app/hello", {}, movementEnum);
        }
    }

    $shooterSocket.disconnect = function() {
        if (stompClient != null) {
            stompClient.disconnect();
        }
        console.log("Disconnected");
    };

})();