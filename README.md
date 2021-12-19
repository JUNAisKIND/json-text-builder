# MINECRAFT JSON BUILDER

## How to use

### send message: 
-    JsonMessage.sendMessage(Player, JM)


JM class:
JM(String, ClickEvent, HoverEvent)

---
### Action:

* ### Only ClickEvent
* CHANGE_PAGE : 메세지 보내기에는 사용 X, 책 텍스트에 사용됨
* COPY_TO_CLIPBOARD : 클릭시 클립보드로 복사
* OPEN_FILE : 작동 X(마크 내 시스템 구현을 위해 존재)
* OPEN_URL : 클릭시 해당 URL로 브라우저를 염
* RUN_COMMAND : 클릭시 해당 커맨드 작동
* SUGGEST_COMMAND : 클릭시 입력칸에 해당 커맨드 자동 작성

* ### Only HoverEvent
- SHOW_ACHIEVEMENT : 발전과제 띄우기
- SHOW_ENTITY : 엔티티 띄우기
- SHOW_ITEM : 아이템 띄우기
- SHOW_TEXT : 텍스트 띄우기
---