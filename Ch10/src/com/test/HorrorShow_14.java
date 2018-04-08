package com.test;

interface Monster {
	void menace();
}

interface DangerousMonster extends Monster {
	void destroy();
}

interface Lethal {
	void kill();
}

class DragonZilla {
	public DangerousMonster getDangerM() {
		return new DangerousMonster() {
			@Override
			public void menace() {

			}

			@Override
			public void destroy() {

			}
		};
	}
}

interface Vampire extends DangerousMonster, Lethal {
	void drinkBlood();
}

class VeryBadVampire {
	public Vampire getVamp() {
		return new Vampire() {

			@Override
			public void destroy() {

			}

			@Override
			public void menace() {

			}

			@Override
			public void kill() {

			}

			@Override
			public void drinkBlood() {

			}
		};

	}
}
	
public class HorrorShow_14 {
	public static void u(DangerousMonster d) {
		d.destroy();
		d.menace();
	}
	public static void v(Vampire v) {
		v.destroy();
		v.drinkBlood();
		v.kill();
		v.menace();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragonZilla dragon = new DragonZilla();
		u(dragon.getDangerM());
		VeryBadVampire vamp = new VeryBadVampire();
		v(vamp.getVamp());
	}
}
