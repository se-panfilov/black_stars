load('desktop/assets/js/lib/jvm-npm.js');
var asd = require('desktop/assets/js/asd.js');

function Main(name) {
    print('Hi there from Javascript, ' + name);
    asd.doSomething();
    return "greetings from javascript";
};
