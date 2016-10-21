(function() {

$(document).ready(function() {
    var canvas = new Canvas();
    var x = canvas.getCenterX();
    var y = canvas.getCenterY();
    draw();

    function draw() {
        canvas.clearCanvas();
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

    this.getCenterX = function() {
        return centerX;
    };

    this.getCenterY = function() {
        return centerY;
    }

    this.drawShooter = function(x, y) {
        var radius = 5;
        context.beginPath();
        context.beginPath();
        context.arc(x, y, radius, 0, 2*Math.PI);
        context.stroke();
    };

    this.clearCanvas = function() {
        context.clearRect(0, 0, canvas.width, canvas.height);
    };
}

})();