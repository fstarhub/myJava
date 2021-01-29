package com.star;

public enum LikeMusic {
    歌手0("周杰伦",45),
    歌手1("方文山", 50),
    歌手2("草蜢",48);
    public String name;
    private int age;

//    LikeMusic(String name) {
//        this.name = name;
//    }

    LikeMusic(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
