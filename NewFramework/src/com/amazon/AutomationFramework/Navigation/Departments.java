package com.amazon.AutomationFramework.Navigation;

public class Departments{
    static final String menuName="shopall";

    public static SelectorClass MoviesMusicAndGames(){
    return new SelectorClass("Movies, Music & Games");}

    public static class SelectorClass{
        String SubLinkTitle;
        public SelectorClass(String sublinktitle){
            this.SubLinkTitle = sublinktitle;
        }

        public void MusicalInsttruments(){
            TopMenuSelector_Navi.HoverOnMenu(menuName);
            SubLinkTitle = "Musical Instruments";
            TopMenuSelector_Navi.HoverOnSubMenu(SubLinkTitle);
            TopMenuSelector_Navi.SuperSelect(SubLinkTitle);
        }

        public void  Headphones(){
            TopMenuSelector_Navi.HoverOnMenu(menuName);
            SubLinkTitle = "Headphones";
            TopMenuSelector_Navi.HoverOnSubMenu(SubLinkTitle);
            TopMenuSelector_Navi.SuperSelect(SubLinkTitle);
        }

        public void Select() {
            TopMenuSelector_Navi.HoverOnMenu(menuName);
            TopMenuSelector_Navi.SuperSelect(SubLinkTitle);
        }
    }
}