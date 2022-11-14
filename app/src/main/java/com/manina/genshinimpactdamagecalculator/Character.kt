package com.manina.genshinimpactdamagecalculator

class Character(title: String, name: String) {
    private var title: String = title
    private var name: String = name

    public fun getTitle(): String{
        return this.title
    }

    public fun getName(): String{
        return this.name
    }
}