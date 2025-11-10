package snippet;

public class Snippet {
	아, 지금 상황은 **768px보다 큰 화면에서는 메뉴 버튼(`.menu-toggle`)을 안 보이게** 하고, **작은 화면에서만 보이게** 하고 싶다는 거군요. 😄
	
	그럼 CSS를 이렇게 조정하면 됩니다.
	
	---
	
	## 1️⃣ 기본 상태: PC(큰 화면)
	
	```css
	/* 기본 상태: PC용 */
	.menu-toggle {
	  display: none; /* 큰 화면에서는 버튼 숨김 */
	}
	
	nav ul {
	  display: flex; /* 큰 화면에서는 메뉴 항상 보임 */
	}
	```
	
	---
	
	## 2️⃣ 작은 화면(768px 이하) 미디어 쿼리
	
	```css
	@media (max-width: 768px) {
	  nav ul {
	    display: none; /* 메뉴 숨김 */
	  }
	
	  .menu-toggle {
	    display: block; /* 작은 화면에서는 버튼 보임 */
	  }
	}
	```
	
	✅ 정리:
	
	* 화면이 **768px 이하** → 메뉴 버튼 보임, 메뉴 숨김
	* 화면이 **768px 초과** → 메뉴 버튼 숨김, 메뉴 항상 보임
	
	---
	
	원하면 제가 이 구조에 **슬라이더 겹침 문제도 해결한 완전 예제** 만들어서 보여드릴 수도 있습니다.
	그대로 만들어드릴까요?
	
}

