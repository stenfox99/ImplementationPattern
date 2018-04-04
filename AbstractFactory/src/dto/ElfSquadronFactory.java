package dto;

import interfacesPerson.Archer;
import interfacesPerson.Mage;
import interfacesPerson.Warrior;

public class ElfSquadronFactory extends SquadronFactory {
    @Override
    public Mage createMage() {
        return new ElfMage();
    }

    @Override
    public Archer createArcher() {
        return new ElfArcher();
    }

    @Override
    public Warrior createWarrior() {
        return new ElfWarrior();
    }
}
