# 번역 적용하는 법
이 모드는 모드팩인 VaultHunters의 주요 모드라고 할 수 있는 TheVault 모드의 번역을 제공합니다.
어디서 적용되는지 확실하지 않은 것들은 번역하지 않았고, 모드 이름도 이 모드팩에 들어있는 전부가 번역이 되어있는 것이 아니기 때문에 번역하지 않았습니다.

## 아이템 이름 번역
the_vault_kr 폴더 안의 파일을 모드.jar 파일을 디컴파일해서 넣을 수도 있지만,  
리소스팩 형식으로 만들었으므로 the_vault_kr 폴더를 압축해서 리소스팩으로 적용하는 것을 추천합니다.

## 스킬 및 연구 등 번역 (인코딩 문제 있음)
모드팩 폴더 최상위에 config 폴더를 붙여 넣기

## 인코딩 문제 해결하기
하지만 이것만으로는 모드가 json을 인코딩하는 코드가 문제가 있기 때문에 한글이 깨져 나옵니다.  
이 모드가 깃허브에 오픈소스로 올라와있는 것처럼 보이지만, 이전 시즌의 파일이고, 현재 버전의 파일은 디컴파일하지 않으면 알 수 없습니다.  
따라서 [***recaf***](https://www.coley.software/Recaf/) 와 같은 .jar 파일 디컴파일 및 수정 프로그램으로 모드.jar 파일을 수정해야 합니다.

### 수정 방법
1. recaf로 모드.jar 파일을 열고 config 폴더의 Config.java 파일을 연다. (모드.jar : the_vault-1.7.2p1.12.4.jar <버전에 따라 다름>)
2. Config.java 안의 텍스트 내용을 깃허브의 Config_edited.java 파일의 텍스트 내용으로 바꾼다.
3. 인터넷에서 [***GSON***](https://search.maven.org/artifact/com.google.code.gson/gson/2.9.0/jar)을 다운받는다. (오른쪽 위 downloads - jar)
4. recaf에서 file - Add library로 다운 받은 GSON의 .jar파일을 추가한다.
5. file - Export Program 으로 .jar 다시 컴파일한다.
6. 모드팩의 모드 폴더에 원래있던 모드.jar 파일을 지우고 방금 컴파일한 파일을 넣는다.
