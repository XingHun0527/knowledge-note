package com.briup13;

public class exe73041 {
		private Long id;
		private String name;
		private Integer age;
		private String gender;
		
		public exe73041() {
			
		}
		public exe73041(Long id, String name, Integer age, String gender) {
			super();
			this.id = id;
			this.name = name;
			this.age = age; 
			this.gender = gender;
		}

		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
		}
}