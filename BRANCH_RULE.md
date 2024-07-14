# Cashbook Project: Branch Rule Sets

## 0. Introduction
- branch rulesets name은 target branch를 유추할 수 있도록 네이밍하기
- 4가지 유형에 맞추어 정리
  - Branch (브랜치 삭제, 수정, 생성)
  - Commit
  - Push
  - Merge

<br />

## 1. Main

| 유형              | 설명                               |
|:----------------|:---------------------------------|
| Branch          | 허용된 사용자만이 브랜치 수정, 삭제 가능          |
| Push            | local에서 remote로의 직접 push 금지      | 
| Merge           | Required Approvals: 1            |
|                 | 새로운 commit이 push되면 PR Approve 해제 |
|                 | 모든 댓글의 resolve 필수                |

<br />

## 2. Develop

| 유형    | 설명                               |
|:------|:---------------------------------|
| Branch          | 허용된 사용자만이 브랜치 수정, 삭제 가능          |
| Push  | local에서 remote로의 직접 push 금지      |
| Merge | Required Approvals: 1            |
|       | 새로운 commit이 push되면 PR Approve 해제 |
|       | 모든 댓글의 resolve 필수                |

<br />

## 3. Feature

| 유형    | 설명                          |
|:------|:----------------------------|
| Branch          | `feature/`로 시작하는 브랜치 이름만 가능 |

<br />

## 4. Fix

| 유형    | 설명                      |
|:------|:------------------------|
| Branch          | `fix/`로 시작하는 브랜치 이름만 가능 |

<hr />

#### <i>updated at: 2024.07.14 (Sun)</i>
