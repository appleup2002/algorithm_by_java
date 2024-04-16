package org.experience01.Pojo;

public class Student {
    private String  major, name;
    private Integer id, treeMount;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTreeMount() {
        return treeMount;
    }

    public void setTreeMount(Integer treeMount) {
        this.treeMount = treeMount;
    }

    public Student(String major, String name, Integer id, Integer treeMount) {
        this.major = major;
        this.name = name;
        this.id = id;
        this.treeMount = treeMount;
    }

    public Student() {
    }
    @Override
    public String toString(){
        return major + "  " + name + "  " + id + "  " + treeMount;
    }
}
