class Rectangle {
    constructor(height, width) {
      this.height = height;
      this.width = width;
    }
  }
  
  Rectangle.prototype.getArea = function getArea() {
    return this.width * this.height;
  };

const r = new Rectangle(4,5);
document.write(r.getArea());
r.height=50;
