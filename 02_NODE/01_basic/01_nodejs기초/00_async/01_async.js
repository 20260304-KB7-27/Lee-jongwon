function sayhello() {
  console.log('hello');
}

setTimeout(sayhello, 3000); //안녕 먼저 나오고 3초후에 hello출력
console.log(`안녕`);
