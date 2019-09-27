function Animal(name) {
    this.name = name;
  }
  
  // add simple property on prototype
  Animal.prototype.generation = '100';
  
  // create object
  var a = new Animal( 'Dog' );
  
  // log generation
  console.log( 'a.generation ==> ', a.generation );
  
  // check if generation is own property of object a
  console.log( 'has own generation ==> ', a.hasOwnProperty( 'generation' ) );