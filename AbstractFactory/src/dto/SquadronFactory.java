package dto;

import interfacesPerson.Archer;
import interfacesPerson.Mage;
import interfacesPerson.Warrior;

public abstract class SquadronFactory {
    public abstract Mage createMage();

    public abstract Archer createArcher();

    public abstract Warrior createWarrior();
}
