class Rectangle {
    constructor(height, width) {
      this.height = height;
      this.width = width;
    }
  }
  
  Rectangle.prototype.getArea = function getArea() {
    return this.width * this.height;
  };
  
  const obj = new Rectangle(5, 7);
  
  document.write("Area Of Rectangle Using Prototype Property : " +obj.getArea()); 