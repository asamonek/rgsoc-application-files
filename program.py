from actors import Wizard, Creature, SmallAnimal, Dragon
import random
import time


def main():
    print_header()
    game_loop()

def print_header():
    print('----------------------------------------------------')
    print('               WIZARD BATTLE GAME')
    print('----------------------------------------------------')
    print()

def game_loop():

    creatures = [
        SmallAnimal('Toad', 1),
        Creature('Tiger', 12),
        SmallAnimal('Bat', 3),
        Dragon('Dragon', 50, 75, True),
        Wizard('Evil Wizard', 1000),
        Creature('birb', 90),
    ]

    print(creatures)

    hero = Wizard('Gandalf', 75)


    while True:

        active_creature = random.choice(creatures)

        print('A {} of f level {} has apppeared from a dark and foggy forest...'.format(active_creature.name, active_creature.level))
        print()

        cmd = input('Do you [a]ttack, [r]unaway or [l]ook around? ')
        cmd = cmd.lower()

        if cmd == 'a':
            if hero.attack(active_creature):
                creatures.remove(active_creature)
            else:
                print('The wizard runs and hides taking time to recover...')
                time.sleep(5)
                print('The wizard returns revitalized!')
                # print("Game over.")
                # break
        elif cmd == 'r':
            print('The wizard flees!')
        elif cmd == 'l':
            print('The wizard {} takes in the surroundings and sees:'.format(hero.name))
            for c in creatures:
                print(' * A {} of level {}'.format(c.name, c.level))
        else:
            print('OK. Exiting game... bye!')
            break

        if not creatures:
            print('You defeated all the creatures!')
            break

        print()


if __name__ == '__main__':
    main()