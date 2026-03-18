## 온라인 코드 리뷰 과정

### 1. 프로젝트를 자신의 계정으로 fork한다. 저장소 우측 상단의 fork 버튼을 활용한다.

> Q-Java-Spring-Study 저장소는 권한이 없기 때문에 미션을 진행한 코드를 추가할 수 없다.  
> fork는 Q-Java-Spring-Study의 저장소를 자신의 계정으로 복사하는 기능이다. 앞으로 모든 미션은 자신의 계정 아래에 있는 저장소를 활용해 진행한다.

- fork는 Q-Java-Spring-Study 저장소 우측 상단의 fork 버튼을 활용한다.

### 2. fork한 저장소를 자신의 컴퓨터로 clone한 후 디렉토리로 이동한다.

> fork한 저장소는 github.com에 존재하기 때문에 바로 작업할 수 있다.  
> clone 명령은 github.com에 존재하는 저장소를 자신의 노트북 또는 PC로 복사하는 과정이다.

- 터미널에서 다음 명령을 입력한다.

```
git clone -b {본인_아이디} --single-branch https://github.com/{본인_아이디}/{저장소 아이디}
ex) git clone -b minseon --single-branch https://github.com/Q-Java-Spring-Study/lotto.git

// clone한 폴더로 이동하는 방법
cd {저장소 아이디}
ex) cd lotto
```

### 3. 기능 구현을 위한 브랜치 생성

> git은 서로 다른 작업을 하기 위한 별도의 공간을 생성할 때 브랜치를 생성할 수 있다.  
> 브랜치를 생성하는 이유는 실무에서 프로젝트를 진행할 때와 같은 방법으로 기능을 구현하고, 리뷰하는 경험을 전달하기 위함이다.

```
터미널에서 다음 명령을 입력해 브랜치를 생성한다.
git checkout -b 브랜치이름
ex) git checkout -b step1
```
