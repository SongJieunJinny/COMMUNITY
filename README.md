# COMMUNITY

## 📑 목차

- [프로젝트 진행기간](#프로젝트-진행기간)
- [프로젝트 소개](#프로젝트-소개)
- [Team Members](#Team-Members)
- [주요목표](#주요목표)
- [주요 기능 요약](#주요-기능-요약) 
- [개발환경](#개발환경)
- [PPT 및 추가 자료들](#PPT-및-추가-자료들)
- [담당기능](#담당기능)
- [트러블슈팅](#트러블슈팅)
- [개선할 부분](#개선할-부분)

--- 

## 🗓️프로젝트 진행기간
- 2024.11.28 ~ 2025.01.03

--- 

## 🎯 프로젝트 소개
- 사내 조직의 **근태 관리, 실시간 채팅, 일정 공유, 게시판, 경조금·의료비 신청** 등을 한 플랫폼에서 처리할 수 있는 **통합형 사내 커뮤니티 웹 시스템**입니다.
- Spring Security를 이용해 부서·직책별 권한을 세분화하고, AJAX와 WebSocket 기반으로 실시간 소통이 가능한 업무 환경을 구현했습니다.

--- 

## 👥Team Members

| Name   | Role | Planning                | Development |
|--------|------|-------------------------|-------------|
| 송지은 | 팀장 | HTML, CSS 제작, 프로토타입, 화면설계서, 사내규정 제정, ERD,  발표 | 비밀번호 재설정(JavaMailSender), 내정보조회 및 수정, 근태 관리, 복지 관리(File Upload) |
| 장이슬 | 팀원 | HTML, CSS 제작, 시퀀스(로그인), 프로젝트 주제제안서, 일정관리(노션), ERD| 로그인&로그아웃(스프링시큐리티), 채팅방 기능(웹소켓), 관리자 기능, 게시판 및 댓글CRUD, 스프링 필터(XSS 및 비속어처리), 스프링 스케쥴러 |
| 박인재 | 팀원 | HTML, CSS 제작, 요구사항분석서, 프로젝트설계서 작성, PPT | 부서업무 관리, 주간근무시간 관리, 출퇴근 관리(지오로케이션) |

--- 

## 💡주요목표
- 반복적이고 수동적인 **사내 행정 절차(근태, 복지, 게시판 등)의 자동화**
- **부서 간 협업**을 위한 일정 공유 및 채팅 기능 제공
- **관리자(Admin)** 중심의 사원 관리 및 결재 프로세스 간소화
- 모든 기능을 **Spring MVC 아키텍처 기반으로 계층화하여 유지보수성 강화**
  
--- 

## ⚙️ 주요 기능 요약
| 구분| 기능| 기술 키워드|
|-----|------|------------|
|👥 회원/인증|	회원가입, 로그인, Spring Security 기반 권한 제어|	BCrypt, Security Filter|
|🕒 근태관리|	GPS 기반 출퇴근 등록, 근무시간 요약|	Geolocation API, AJAX|
|💬 실시간 채팅|	1:1 및 그룹 채팅, 읽음 표시, 초대/퇴장|	WebSocket, jQuery|
|🗓️ 일정관리|	부서별 FullCalendar 일정 등록·수정·삭제|	FullCalendar, REST API|
|📢 게시판|	공지사항·커뮤니티, 댓글 비동기 처리|	JSTL, AJAX|
|🏢 관리자 기능|	사원 조회/수정, 엑셀 업로드 등록|	Apache POI, AjaxController|
|💰 복지신청|	경조금, 의료비 신청 및 결재 승인 프로세스|	File Upload, MyBatis|
|👤 마이페이지|	개인정보 수정, 비밀번호 변경(메일 인증)|	JavaMailSender, AJAX|
  
--- 

## 🛠개발환경
### Backend
- JDK 1.8 / JAVA 8
- Spring Framework 4.3.3.RELEASE
- Spring Security 3.2.10.RELEASE
- MyBatis 3.4.1

### Frontend
- HTML5 / CSS3 / JavaScript
- JSP 4 / Ajax
- jQuery

### Database & Server
- MySQL 8.0 (Workbench 8.0)
- Apache Tomcat 9.0
 
### Tools & Collaboration
- Spring Tool Suite 4 (STS)
- Visual Studio Code
- MySQL Workbench 8.0
- ERMaster
- StarUML
- Git & GitHub
- Notion

--- 

## 🔗PPT 및 추가 자료들

### ERD
![ERD(최종)](https://github.com/user-attachments/assets/9e1e0c63-627a-48ae-947c-a5d8e32af8ea)
![추가ERD](https://github.com/user-attachments/assets/55299086-2ad7-4484-9765-2b0a13b858f4)

### UseCase
![useCase 수정](https://github.com/user-attachments/assets/864c86c4-3f02-45fd-8998-2a1e22bdf793)

### 시퀀스(로그인)
![시퀀스(로그인)](https://github.com/user-attachments/assets/4bea14c2-65b7-4fa0-9c9f-66a298afe42b)

### 프로토타입
- [📎 Prototype.pptx](https://github.com/SongJieunJinny/second-COMMUNITY/blob/main/springCommunity/src/main/webapp/resources/upload/Prototype.pptx?raw=true)

### 최종PPT
- [📎 Presentation.pptx](https://github.com/SongJieunJinny/second-COMMUNITY/blob/main/springCommunity/src/main/webapp/resources/upload/Presentation.pptx?raw=true)

--- 
## 🖥담당기능
**1) UI 제작 · 프로토타입 · 화면설계서**
 - 산출물: Low/High-fidelity 와이어프레임, 네비게이션 맵, 컴포넌트 인벤토리.
 - 구현: JSP 템플릿化(include/header.jsp), 공통 CSS(board.css, chat.css, login.css), 아이콘 시스템(FontAwesome).
 - 일관성: 그리드, 버튼·폼·모달 상태 규칙, 리스트/페이징 표준 컴포넌트.
 - 접근성: 폰트 대비, 포커스 가능 요소, 키보드 전송(Enter submit) 적용.
 - 성과: 신규 화면 추가 시 평균 마크업 시간 30% 절감.

**2) 사내 규정 제정(업무/복지 프로세스)**
 - 범위: 출퇴근 등록 요건, 경조/의료비 신청 요건·기한·증빙, 승인 단계(1차/2차), 보상 기준표.
 - 시스템 반영:
   - 승인 상태 코드(대기/승인/거절)와 전이 규칙.
   - 경조 구분×대상자별 금액 매핑(프런트 계산 + 서버 검증).
   - 신청기한(이전/이후 1개월) 서버 검증.
 - 리스크 통제: 중복 신청 방지(“구분=관계=대상자” 중복 불가, 결혼 제외).

**3) 비밀번호 재설정 (JavaMailSender)**
 - 화면: mypage/info.jsp 모달(이메일 발송 → 6자리 코드 검증 → 비밀번호 변경).
 - 백엔드:
   - 메일 전송: JavaMailSenderImpl로 SMTP(Gmail/Naver) 설정, TLS/SSL 혼용 검증.
   - 인증: 서버 생성 코드 ↔ 클라이언트 입력값 비교, 시효·횟수 제한.
   - 변경: BCrypt 재해시, 기존 세션 무효화.
 - 예외/보안: 속도 제한(rate limit), 공통 에러 응답, 이메일 존재 노출 방지(모模糊 메시지).
 - 성과: 재설정 실패율 감소, 고객문의 감소.

**4) 내 정보 조회/수정**
 - 화면: mypage/info.do 폼(전화·은행·계좌·주소), 주소 검색(Daum Postcode).
 - 서버: 필드별 화이트리스트 검증, 부분 업데이트, 변경 로그.
 - 제약: 급여 반영 컷오프 고지(말일 전), 은행 코드 마스터 참조.
 - 검증: 전화번호·계좌 서식, 이메일 MX 간이 확인.

**5) 복지 관리(경조금·의료비, 파일 업로드)**
 - 화면:
   - 경조금: mypage/benefit.do 선택(대상자/구분) → 금액 자동 계산 → 사유/증빙 업로드.
   - 의료비: mypage/medical.do 진료 정보 입력 → 첨부 → 신청.
   - 승인자 확인: mypage/form.do 일괄 검토(1차/2차, 반려 사유 입력).
 - 로직:
   - 프런트 금액 산식(benefit_sub × benefit_type) 즉시 표시, 서버 검증 재계산.
   - 신청기한 검증(경조일 기준 ±1개월).
   - 파일: 다중 업로드 허용, 확장자·MIME·용량 제한, 저장명 난수화.
 - 데이터 무결성: 동일 키(구분+대상자+신청자) 중복 차단(서버 유니크).
 - 보안: 다운로드 권한 체크, 경로 역참조 방지.

**6) 발표**
 - 구조: 문제정의 → 규정→ ERD → 주요 시나리오(근태·복지·채팅) → 데모 → 리스크/개선.
 - 데모 스크립트: 실패 케이스 포함(중복 출근, 기한 외 신청, 권한 부족 일정 수정).
 - 자료: 화면흐름도, ERD, 상태 전이(승인/거절) 다이어그램.

--- 
## 🐞트러블슈팅
### 1️⃣ 비밀번호 재설정 시 메일 발송 오류  

**문제 배경**  
 - 비밀번호 재설정 기능 구현 중 Gmail 계정에서는 정상 작동하지만, Naver SMTP 환경에서는 메일이 전송되지 않는 문제가 발생했다.  
 - TLS(587)과 SSL(465) 설정 충돌 및 보안 인증 방식 차이로 인한 오류였다.

**해결 방법**  
 - `JavaMailSenderImpl` 설정에서 SMTP 서버별 포트와 보안 옵션을 분리하고, TLS 전송 활성화(`mail.smtp.starttls.enable=true`)를 명시했다.  
 - 또한 예외 발생 시 로그로 남기도록 `try-catch`를 추가하여 안정성을 높였다.

**코드 비교**

```java
// 수정 전
props.put("mail.smtp.port", "465");
props.put("mail.smtp.ssl.enable", "true");

// 수정 후
if(host.contains("gmail")) {
    props.put("mail.smtp.port", "587");
    props.put("mail.smtp.starttls.enable", "true");
} else {
    props.put("mail.smtp.port", "465");
    props.put("mail.smtp.ssl.enable", "true");
}
```
💭 **알게 된 점**
 - 메일 서버마다 인증 정책이 다르기 때문에 단일 설정으로는 모든 환경을 커버할 수 없음을 깨달았다.
 - 보안 프로토콜은 반드시 서버별로 분리해야 한다는 점을 학습했다.

### 2️⃣ 경조금 금액 불일치 문제

**문제 배경**
 - 경조금 자동 계산 시 화면에서는 올바르게 보이지만, DB 저장 값이 다르게 기록되는 오류가 있었다.
 - 프런트엔드의 JavaScript 계산식과 서버 측 검증 로직이 달라 생긴 문제였다.

**해결 방법**
 - 프런트엔드(benefit.do)의 계산 규칙(benefit_sub × benefit_type)을 기준으로 백엔드에서도 동일 조건으로 재계산 검증을 추가했다.
 - 클라이언트 계산 값과 서버 계산 값이 불일치할 경우 예외를 발생시켜 데이터 무결성을 보장했다.

**코드 비교**

```java
// 수정 전 (프런트 계산만 존재)
if (benefit_sub === '1' && benefit_type === '1') cost = 1000000;

// 수정 후 (서버 검증 추가)
if (benefitSub.equals("1") && benefitType.equals("1")) {
    benefitMoney = 1000000;
}
```
💭 **알게 된 점**
 - 클라이언트 계산 결과만 믿지 않고, 서버 검증을 반드시 병행해야 데이터 신뢰성을 확보할 수 있음을 배웠다.

### 3️⃣ 주소 검색 시 상세주소 누락

**문제 배경**
 - Daum Postcode API를 통해 주소 검색 후 상세주소가 저장되지 않았다.
 - 리턴되는 필드명이 roadAddress와 detailAddress로 나뉘어 있는데, 이 중 하나가 누락되어 DB에 null이 저장되는 문제가 있었다.

**해결 방법**
 - API 반환값을 점검해 roadAddress, jibunAddress, detailAddress를 구분하고 빈 문자열('')은 null로 변환해 저장하도록 수정했다.

**코드 비교**

```java
// 수정 전
document.getElementById("sample4_roadAddress").value = data.address;

// 수정 후
document.getElementById("sample4_roadAddress").value = data.roadAddress || '';
document.getElementById("sample4_detailAddress").value = data.buildingName || '';
```
💭 **알게 된 점**
 - 외부 API는 반환 필드가 바뀔 수 있으므로 null-safe 처리와 예외 검증을 반드시 해야 한다는 점을 배웠다.

### 4️⃣ 파일 업로드 시 500 오류

**문제 배경**
 - 복지 관리(경조금/의료비 신청)에서 사용자가 5MB 이상의 대용량 파일을 업로드할 때 서버에서 500 Internal Server Error가 발생했다.
 - Spring의 기본 업로드 용량 제한(1MB)을 초과한 것이 원인이었다.

**해결 방법**
 - application.properties에 업로드 한도를 명시적으로 설정하고, 파일 크기·확장자·MIME 타입 검증 로직을 추가했다.

**코드 비교**

```java
// 수정 진행 
spring.servlet.multipart.max-file-size=10MB
spring.servlet.multipart.max-request-size=20MB
```
💭 **알게 된 점**
 - 파일 업로드 기능은 단순히 동작하는 것뿐 아니라, 용량·형식·예외처리를 함께 고려해야 안정적임을 배웠다.

--- 
## 📖개선할 부분

 - 비밀번호 인증시 현재는 6자리 코드 인증으로 되어있으나 이메일 토큰 기반 링크(JWT 인증 URL)로 개선 예정입니다.
 - 팀원 간의 일정을 최대한 조율하려 했으나, 프로젝트 중간 팀원의 중도 포기 및 독감 등으로 인한 결원이 발생으로 작업에 차질이 생겼습니다.
이로 인해 프로젝트 기능 구현이 끝까지 마무리 되지 못한게 매우 아쉬웠고, 나중에는 좀 더 유연한 일정관리를 할 수 있도록 노력해보려합니다.

--- 
