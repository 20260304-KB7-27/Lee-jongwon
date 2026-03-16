const fs = require('fs');
const path = require('path');

const folderPath = path.join(__dirname, '/test');

console.log('폴더 경로 : ', folderPath);

//비동기방식
if (fs.existsSync(folderPath)) {
  //existsSync는 동기방식이지만 파일 확인을 위해 사용
  console.log(`폴더가 존재합니다.`);
} else {
  fs.mkdir(folderPath, (err) => {
    if (err) {
      console.error(err);
      return;
    }
    console.log(`폴더가 생성되었습니다.`);
  });
}
