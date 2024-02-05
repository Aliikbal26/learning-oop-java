package oop.data;

//auther class
public class Company {
    private String name;

    public String SetName(String name) {
        return this.name;
    }

    public String getName() {
        return this.name;
    }

    // inner class dari company
    public class Employee {
        private String name;

        public String getCompany() {
            return Company.this.name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
}
