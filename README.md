# MINECRAFT JSON BUILDER

## How to use

###send message: 
-    JsonMessage.sendMessage(Player player, JM...jm)


###JM class:
```
JM(String text) // 아무 효과 없는 일반 텍스트
JM(String text, Styles...styles) // 스타일(색, 굵기 등)을 가진 텍스트. 그냥 ChatColor 쓰세요
JM(String text, ClickEvent clickEvent, HoverEvent hoverEvent) // 클릭시, 마우스 올릴시 이벤트를 가진 텍스트
//(clickEvent, hoverEvent- null 가능)

JM(...).setInsertion(String insertion) : JM // Shift+click시 입력칸에 텍스트를 자동 작성함
JM(...).addExtra(BaseComponent component | JM jm) : JM // Extra 추가
JM(...).r() : TextComponent // TextComponent 로 빌드
```

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

---
## Examples

###1. 그냥 hellow 텍스트
```
JsonMessage.sendMessage(Player player, new JM("hellow")
```
###2. 클릭시 /help명령어 작동, 마우스 올리면 클릭! 메세지를 보이는 haha 텍스트
```
JsonMessage.sendMessage(Player player,
    new JM("haha", new ClickEvent(Action.RUN_COMMAND, "/help"), new HoverEvent(Action.SHOW_TEXT, "클릭!"))
  )
```
###1번 + 2번
```
JsonMessage.sendMessage(Player player,
    new JM("hellow"),
    new JM("haha", new ClickEvent(Action.RUN_COMMAND, "/help"), new HoverEvent(Action.SHOW_TEXT, "클릭!"))
  )
```
---