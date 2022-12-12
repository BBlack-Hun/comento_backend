# HTTP 란
- HTTP는 Hyper Text Transfer Protocol의 두문자어로, 인터넷에서 데이터를 주고받을 수 있는 프로토콜입니다. 프로토콜은 규칙이라고 생각하시면 됩니다. 이렇게 규칙을 정해두었기 때문에, 모든 프로그램이 이 규칙에 맞춰 개발해서 서로 정보를 교환할 수 있게 된 것이죠.
  (출처: 조코딩, https://www.zerocho.com/category/HTTP/post/5b344f3af94472001b17f2da)


# 브라우저의 요청 시, 서버의 응답과정
1. 서버에서 브라우저로 요청(GET, POST, PATCH or PUT, DELETE) Request
2. 웹서버에로 도착시, 해당 요청을 웹 어플리케이션 서버(WAS)로 전달 
3. WAS에서 해당 요청에 따른 데이터를 응답 메시지에 넣고 브라우저(클라이언트)로 전달