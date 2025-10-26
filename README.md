# second-COMMUNITY

## 📑 목차

- [프로젝트 진행기간](#프로젝트-진행기간)
- [프로젝트 소개](#프로젝트-소개)
- [Team Members](#Team-Members)
- [주요목표](#주요목표)
- [주요 기능 요약](#주요-기능-요약) 
- [개발환경](#개발환경)
- [ERD](#erd)
- [담당기능](#담당기능)
- [트러블슈팅](#트러블슈팅)
- [개선할 부분](#개선할 부분)

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

## 🔗ERD
![ERD(최종)](https://github.com/user-attachments/assets/9e1e0c63-627a-48ae-947c-a5d8e32af8ea)

--- 
## 🖥담당기능

--- 
## 🐞트러블슈팅

--- 
## 📖개선할 부분

--- 
