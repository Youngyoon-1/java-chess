# java-chess

### 체스 미션 저장소

체스는 가로와 세로가 각각 8줄씩 64칸으로 격자로 배열 된 체스보드에서 두 명의 플레이어가 피스들을 규칙에 따라 움직여 싸우는 보드 게임이다.

## ♟️ 구현해야 하는 기능

> 입력 예외 발생 시 `Illegalargumentexception` 을 발생시킨다.

### 체스 게임 시작

- [x] 체스 게임에 대한 명령을 설명한다.
    - [x] `start` : 체스 게임 시작
    - [x] `end` : 체스 게임 종료
    - [X] `move` : 체스 말 이동
- [x] `start` 명령어를 입력하면 체스판을 초기화한다.
    - [예외처리] 빈 값을 입력하면 예외가 발생한다.
    - [예외처리] null 값을 입력하면 예외가 발생한다.
    - [예외처리] 체스 게임에서 사용하는 명령어를 입력하지 않으면 예외가 발생한다.
- [x] 체스판에 놓인 피스의 위치를 출력한다.

### 체스 게임 종료

- [x] `end` 명령어를 입력하면 프로그램이 종료된다.
    - [예외처리] 빈 값을 입력하면 예외가 발생한다.
    - [예외처리] null 값을 입력하면 예외가 발생한다.
    - [예외처리] 체스 게임에서 사용하는 명령어를 입력하지 않으면 예외가 발생한다.
- [ ] 상대편 king 이 잡히는 경우 게임에서 진다.
- [ ] status 명령을 입력하면 각 진영의 점수를 출력하고 어느 진영이 이겼는지 결과를 볼 수 있어야 한다.
    - [x] 왕이 잡혔는지 확인한다. -> 결과를 구한다.
        - [x] 각 말의 점수는 queen 은 9점, rook 은 5점, bishop 은 3점, knight 는 2.5점이다.
        - [x] pawn 의 기본 점수는 1점이다. 하지만 같은 세로줄에 같은 색의 폰이 있는 경우 1점이 아닌 0.5점을 준다.
        - [x] king은 잡히는 경우 경기가 끝나기 때문에 점수가 없다.
        - [x] 한 번에 한 쪽의 점수만을 계산해야 한다.
        - [x] 검은색 점수: 20 점
        - [x] 흰색 점수: 19 점
        - 검은색 승리

### 체스 기물 이동

- [x] `move` 명령어를 입력하면 기물을 움직일 수 있다.
    - [예외처리] 이동시킬 위치와 이동할 위치가 같은 경우 예외가 발생한다.
    - [예외처리] 이동시킬 위치에 말이 없으면 예외가 발생한다.
    - [예외처리] 이동시킬 위치의 말이 현재 플레이어의 말이 아니면 예외가 발생한다.
    - [예외처리] 이동할 위치에 있는 말이 현재 플레이어의 말이면 예외가 발생한다.
    - [예외처리] 위치값이 두 개가 아니면 예외가 발생한다.
    - [예외처리] 체스판의 범위를 넘어가는 위치값일 경우 예외가 발생한다.

### 체스 기물 이동방식

- [x] 공통 규칙: 나이트를 제외한 모든 기물은 자신의 다른 기물을 넘어갈 수 없다.

- [x] Pawn 은 현재 위치에서 앞 방향으로 한 칸 이동할 수 있다.
- [x] Pawn 은 처음 이동시 두 칸을 이동할 수 있다.
- [x] Pawn 은 대각선에 상대편 말이 있는 경우 상대편 말을 제거하고 움직일 수 있다.
    - [예외처리] 뒤로 움직일 경우 예외가 발생한다.

- [x] Rook 은 상하좌우로 칸 수 제한없이 이동 가능하다.

- [x] Bishop 은 대각선으로 칸 수 제한없이 이동 가능하다.

- [x] Knight 는 한 방향으로 두 칸 이동하고 90도 방향으로 한 칸 이동 가능하다.

- [x] Queen 은 모든 방향으로 칸 수 제한없이 이동 가능하다.

- [x] King 은 모든 방향으로 한 칸 이동 가능하다.
    - [ ] 체크 상태가 되는 방향으로 움직이면 예외가 발생한다.

### 체스 특수 규칙

- [ ] Promotion: Pawn 이 상대편의 마지막 행(Rank)에 도착하면 원하는 말로 승진할 수 있다.
    - [ ] Pawn 과 King 제외한 기물을 선택할 수 있다.
- [ ] Castling: King 은 좌우로 2칸 이동하고 Rook 은 King 의 반대편으로 이동 할 수 있다.
    - [예외처리] King 과 Rook 모두 첫 이동이 아닐 경우 예외가 발생한다.
    - [예외처리] King 과 Rook 사이에 기물이 있을 경우 예외가 발생한다.
    - [예외처리] King 은 체크 상태이거나 체크 자리를 통과하게 될 경우 예외가 발생한다.
- [ ] EnPassant: 상대방 Pawn 이 첫 두 칸을 움직여 내 Pawn 의 바로 옆에 위치할 경우 해당 Pawn 을 잡을 수 있다.

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)
