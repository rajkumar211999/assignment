class Rectangle {
    constructor(height, width) {
      this.height = height;
      this.width = width;
    }
  
    // To define a method named `methodName`, you put `methodName() {}` in
    // the class declaration.
    area() {
      return this.width * this.height;
    }
}

  const obj = new Rectangle(3, 5);
  document.write("The Area Of The Rectangle : " +obj.area()); // 15

