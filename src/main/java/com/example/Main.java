package com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //각 유닛 객체 생성
        Unit marine = new Unit("marine",20,6,"Terran Unit");
        Unit Zealot = new Unit("Zealot",30,8,"Protoss Unit");
        Unit Zergling = new Unit("Zergling",15,5,"Zerg Unit");
        Unit [] units = {marine, Zealot, Zergling};

        //향상된 for문을 통해 유닛 리스트 내 유닛 정보 및 초기 위치 출력
        for (Unit unit : units) {
            unit.printUnitInfo();
            unit.setPosition(0);
        }

        marine.move();
        Zealot.move();
        Zergling.move();


        //이동 후 유닛의 위치 출력
        for (Unit unit : units) {
            System.out.println(unit.getName() + "유닛의 최종 위치는" + unit.getPosition() + "입니다.");
        }

        //공격하기
        marine.attack(Zealot);
        marine.attack(Zealot);
        marine.attack(Zealot);
        marine.attack(Zealot);
        marine.attack(Zealot);
        marine.attack(Zealot);
        marine.attack(Zealot);



        // 위에꺼 끝내면 -> 상속 다형성을 통해 Unit을 상속 받아 Terran, Zerg, ...  등 setting하면 된다.
    }
}