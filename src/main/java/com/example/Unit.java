package com.example;
import java.util.Random;

public class Unit {
    //이름, 체력, 공격력, 위치,유닛에 대한 설명 (필드)
    private final String name;
    private  int hp;
    private final int damage;
    private  int position;
    private final String description;

    //생성자
    public Unit (String _name, int _hp, int _damage, String _description) {
        this.name = _name;
        this.hp = _hp;
        this.damage = _damage;
        this.description = _description;
    }

    //이동, 체력, 공격, 유닛의 설명 출력
    public void printUnitInfo() {
        System.out.println(this.name + "| " + "체력: " + this.hp + " | "  + "공격력: " +  this.damage + " | " + "설명: " + this.description);
    }

    //위치 설정
    public void setPosition(int _position) {
        this.position = _position;
        printPosition();
    }

    //유닛의 초기 위치 출력
    public void printPosition () {
        System.out.println(this.name + "의 초기 위치는" + this.position + "입니다." );
    }

    // 유닛의 이동
    public void move() {

        //방향 및 이동 거리 랜덤으로 설정
        String [] direction = {"left", "right"};
        Random random = new Random ();

        for(int i = 0; i <= random.nextInt(20); i++) {
            String direct = direction[random.nextInt(2)];
            System.out.println(this.name + "유닛이" + direct + "쪽으로 이동하였습니다.");

            switch(direct){
                case "left":
                    this.position -= 1;
                    break;
                case "right":
                    this.position +=1;
                    break;
                default:
                    break;
            }
        }
    }

    //유닛 이름
    public String getName () {
        return this.name;
    }

    //이동한 위치 정보
    public int getPosition () {
        return this.position;
    }

    public Unit getTarget(Unit target) {
        return target;
    }
    public void attack(Unit target) {

        //타겟의 hp가 0이하라면 사망했다는 문구 출력
        if(target.hp <= 0) {
            System.out.println(target.name + "이 사망하였습니다.");
        } else {
            System.out.println(this.name + "이" + target.name + "을 공격했습니다.");
            target.hp -= this.damage;
        }

    }
}
