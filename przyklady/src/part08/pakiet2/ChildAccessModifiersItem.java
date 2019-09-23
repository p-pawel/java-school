package part08.pakiet2;

import part08.pakiet1.AccessModifiersItem;

public class ChildAccessModifiersItem extends AccessModifiersItem {

    public void hey() {
        this.c = 1;

        ChildAccessModifiersItem accessModifiersItem = new ChildAccessModifiersItem();
        accessModifiersItem.c = 2;
    }

    static public void main(String[] args) {
        ChildAccessModifiersItem accessModifiersItem = new ChildAccessModifiersItem();
        accessModifiersItem.c = 2;
    }
}
