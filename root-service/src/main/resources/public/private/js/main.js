(function() {

$(document).ready(function() {
    var canvas = new Canvas();
    var x = canvas.getCenterX();
    var y = canvas.getCenterY();

    $shooterSocket.connect(function(frame) {
        $shooterSocket.subscribe(function () {

        });
    })

    draw();

    function draw() {
        canvas.clearCanvas();
        canvas.initCanvas();
        canvas.drawShooter(x++, y);

        if (x > 0 && x < 1000) {
            setTimeout(draw, 100);
        }
    }
});

function Canvas() {
    var canvas = document.getElementById('canvas');
    canvas.width  = window.innerWidth;
    canvas.height = window.innerHeight;
    var context =  canvas.getContext('2d');
    var centerX = canvas.width / 2;
    var centerY = canvas.height / 2;

    $('#canvas').keydown(function(e) {
        switch(e.which) {
            case 37: // left
            $shooterSocket.move('LEFT');
            break;

            case 38: // up
            $shooterSocket.move('UP');
            break;

            case 39: // right
            $shooterSocket.move('RIGHT');
            break;

            case 40: // down
            $shooterSocket.move('DOWN');
            break;

            default: return; // exit this handler for other keys
        }
        e.preventDefault();
    });

    function addLogoutButton() {


        var radius = 5;
        context.beginPath();
        context.arc(x, y, radius, 0, 2*Math.PI);
        context.stroke();
    };

    this.getCenterX = function() {
        return centerX;
    };

    this.getCenterY = function() {
        return centerY;
    }

    this.drawShooter = function(x, y) {
        var radius = 5;
        context.beginPath();
        context.arc(x, y, radius, 0, 2*Math.PI);
        context.stroke();
    };

    this.clearCanvas = function() {
        context.clearRect(0, 0, canvas.width, canvas.height);
    };

    this.initCanvas = function() {
        $('#canvas').click(function(e) {
            var x = e.clientX;
            var y = e.clientY;
            alert(x + ' ' + y);
        });
    };
}

})();