# the_vault_korean_translation
Files that is needed for translating "The Vault" completely

이 모드는 아이템의 이름 등을 번역해야할 뿐만아니라, 스킬이나 연구 등의 이름, 설명 등도 번역해야 합니다.

전자는 리소스팩으로 번역하며, 후자는 config/the_vault/ 폴더의 .json파일로 번역합니다.

 -> 현재 github에 오픈소스로 되어있는 모드 파일은 최신 버전이 아니며,
 lang 파일도 누락된 부분이 있습니다. 따라서 현재 릴리즈 되어있는 .jar 파일 내부에서 lang 파일을 가져와야 합니다.

따라서 the_vault_korean_translation_resourcepack 폴더를 압축하여 리소스팩으로 만들어 적용하고, config 폴더를 마인크래프트 폴더내에 붙여 넣어 번역 적용해야합니다.

한글로 된 config 파일들을 바로 적용하면 인코딩 문제로 한글이 깨집니다.


## 할 일
config/the_vault_skill_descriptions.json 번역
디컴파일해서 인코딩 문제 해결 가능한지 확인  
-> recaf로 Config.class 파일을 Config_edited.java 파일의 내용으로 교체하고, gson 라이브러리와 함께 컴파일하기
