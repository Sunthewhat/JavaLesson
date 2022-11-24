// ========================================================
// --------------------- CAUTION --------------------- 
// ========================================================
// - Do NOT modify any code below here.
// - Otherwise, any marks from this problem will not be given.
// ========================================================
// ========================================================
class DriverClass {
    // !! Do NOT modify this method !!
    // - Otherwise, any marks from this problem will not be given.
    public static void main(String[] args) {
        System.out.println("Set 1");
        System.out.println("===========");
        Set set1 = new Set();
        set1.print();
        System.out.println("");

        System.out.println("Set 2");
        System.out.println("===========");
        Set set2 = new Set(new int[] { 8, 1, 2, 3, 5, 5, 7, 8, 8, 8, 9 });
        set2.print();
        System.out.println(set2.length());
        System.out.println("");

        System.out.println("Set 3");
        System.out.println("===========");
        Set set3 = new Set(new int[] { 8, 7, 7, 6, 5, 1, -30 });
        set3.print();
        System.out.println(set3.length());
        System.out.println("");

        System.out.println("Set 4");
        System.out.println("===========");
        Set set4 = new Set(new int[] { 9, 4 });
        set4.print();
        System.out.println(set4.length());
        System.out.println("");

        System.out.println("Set 5");
        System.out.println("===========");
        Set set5 = set2.intersect(set3);
        set5.print();
        System.out.println(set5.length());
        System.out.println("");

        System.out.println("Set 6");
        System.out.println("===========");
        Set set6 = set2.union(set5);
        set6.print();
        System.out.println("");

        System.out.println("Set 7");
        System.out.println("===========");
        Set set7 = new Set();
        set7 = set7.union(set2).union(new Set(new int[] { 20, 45, 80, 100, 50 }));
        set7.print();
        System.out.println("");

        System.out.println("Set 8");
        System.out.println("===========");
        Set set8 = new Set();
        set8 = set8.union(set1).union(set1).union(set1).union(set1);
        set8.print();
        System.out.println("");

        System.out.println("Set 9");
        System.out.println("===========");
        Set set9 = new Set();
        set9 = set7.differ(set5);
        set9.print();
        System.out.println("");

        System.out.println("Set 10");
        System.out.println("===========");
        Set set10 = new Set();
        set10 = set1.differ(set1.union(set2));
        set10 = set10.differ(set10).union(set3);
        set10.print();
        System.out.println("");

        System.out.println("Set 11");
        System.out.println("===========");
        Set set11 = new Set();
        set11 = new Set(new int[] { 4, 9 }).differ(set5).union(set4);
        set11.print();
        System.out.println("Is Set11 equivalent to Set1 ? ==> " + (set11.equals(set1) ? "Yes" : "No"));
        System.out.println("Is Set11 equivalent to Set2 ? ==> " + (set11.equals(set2) ? "Yes" : "No"));
        System.out.println("Is Set11 equivalent to Set3 ? ==> " + (set11.equals(set3) ? "Yes" : "No"));
        System.out.println("Is Set11 equivalent to Set4 ? ==> " + (set11.equals(set4) ? "Yes" : "No"));
        System.out.println("");

        System.out.println("Set 12");
        System.out.println("===========");
        Set set12 = new Set();
        set12 = new Set(new int[] {});
        set12.print();
        System.out.println("Is Set12 equivalent to Empty Set ? ==> " + (set12.equals(new Set()) ? "Yes" : "No"));
        System.out.println(
                "Is Set12 equivalent to Empty Set ? ==> " + (set12.equals(new Set(new int[] {})) ? "Yes" : "No"));
        System.out.println("Is Set12 equivalent to Empty Set ? ==> " + (set12.equals(set1) ? "Yes" : "No"));
        System.out.println("");

        System.out.println("Set 13");
        System.out.println("===========");
        Set set13 = new Set();
        set13 = new Set(new int[] { 5, 6, 7 });
        set13.print();
        System.out.println("Do {5, 6, 7} belong to Set 10 ? ==> " + (set13.belongsTo(set10) ? "Yes" : "No"));
        set13 = new Set(new int[] { 5, 7, 8 });
        System.out.println("Do {5, 7, 8} belong to Set 10 ? ==> " + (set13.belongsTo(set10) ? "Yes" : "No"));
        set13 = new Set(new int[] { 1, 2, 5, 98 });
        System.out.println("Do {1, 2, 5, 98} belong to Set 10 ? ==> " + (set13.belongsTo(set10) ? "Yes" : "No"));
        System.out.println("");

        System.out.println("Set 14");
        System.out.println("===========");
        System.out.println(
                "Empty Set U {2,5,6,7} ==> " + new Set().union(new Set(new int[] { 2, 5, 6, 7 })).getStringValue());
        System.out.println(
                "{2,5,6,7} U Empty Set ==> " + new Set(new int[] { 2, 5, 6, 7 }).union(new Set()).getStringValue());
        System.out.println("");

        System.out.println("Set 15");
        System.out.println("===========");
        System.out
                .println("{} - {2,5,6,7} ==> " + new Set().differ(new Set(new int[] { 2, 5, 6, 7 })).getStringValue());
        System.out
                .println("{2,5,6,7} - {} ==> " + new Set(new int[] { 2, 5, 6, 7 }).differ(new Set()).getStringValue());
        System.out.println("");

        System.out.println("Set 16");
        System.out.println("===========");
        set1.union(set2).union(set3).union(set4).union(set5).union(set6).intersect(set1).print();
        System.out.println("");

        System.out.println("Set 17");
        System.out.println("===========");
        System.out.println("Summation of all numbers in ((Set2 - Set2) - Set1) U Set5 equals "
                + Set.sumAllNumberInSet(set2.differ(set2).differ(set1).union(set5)));
        System.out.println("");

        System.out.println("Set 18");
        System.out.println("===========");
        Set set18 = new Set(
                new double[] { Math.log(10), Math.pow(2.5, 2.5), Math.cos(14), Math.PI, Math.asin(0.5), Math.tan(20) });
        set18.print();
        System.out.println("");

        System.out.println("Set 19");
        System.out.println("===========");
        Set set19 = new Set(new double[] { 125d, 168.366666, 14D, 0.2, 1, 3f, 25L, 54f, 010 });
        set19.print();
        System.out.println("");

        System.out.println("Set 20");
        System.out.println("===========");
        Set set20 = new Set(new double[] { 0x4, 0x1, 25L, 011 }).intersect(set10);
        set20.print();
        System.out.println("");
    }
}

// ========================================================
// --------------------- CAUTION ---------------------
// ========================================================
// - ArrayList, and every helper methods in Arrays Class are forbidden.
// ========================================================
// ========================================================
class Set {
    // !! Do NOT modify this attribute !!
    // - Otherwise, any marks from this problem will not be given.
    private double[] number;

    // === Note that the way to construct an new empty set can be these following
    // ways:
    // 1. Set mySet = new Set();
    // 2. Set mySet = new Set(new int[] {});
    // Whenever the variable named number contains nothing, that means the set is
    // empty.
    // ==================================================================================

    // !! It is needed to implement. !!
    public Set() {

    }

    // !! It is needed to implement. !!
    public Set(double[] number) {

    }

    // !! It is needed to implement. !!
    public Set(int[] number) {

    }

    // !! It is needed to implement. !!
    // Any methods provided by Java API for sorting or manipulating elements in an
    // array are prohibitted.
    // Please implement on your own only. Otherwise, your work will not be
    // considered.
    // ==> This method will sort elements in this set.
    private void sortNumber() {

    }

    // !! It is needed to implement. !!
    // Any methods provided by Java API for manipulating an array are prohibitted.
    // Please implement on your own only. Otherwise, your work will not be
    // considered.
    // ==> This method will remove the duplicated elements in this set.
    private void removeDuplicate() {

    }

    // !! It is needed to implement. !!
    // ==> This method will return length of the set.
    // ==> Note that: this method will not count the duplicated elements.
    public int length() {

    }

    // !! It is needed to implement. !!
    // ==> This method will return TRUE/FALSE whether this set belongs to set Set.
    public boolean belongsTo(Set set) {

    }

    // !! It is needed to implement. !!
    // ==> This method will return the set composed of elements in A or B.
    // ==> HINT : A U B
    // ==> {1.0, 2.0, 3.0} U {2.0, 4.0, 5.0, 6.0} equals {1.0, 2.0, 3.0, 4.0, 5.0,
    // 6.0}
    public Set union(Set set) {

    }

    // !! It is needed to implement. !!
    // ==> This method will return the set composed of elements being available both
    // in A and B.
    // ==> HINT : A ∩ B
    // ==> {1.0, 2.0, 3.0} ∩ {2.0, 4.0, 5.0, 6.0} equals {2.0}
    public Set intersect(Set set) {

    }

    // !! It is needed to implement. !!
    // ==> This method will return the set composed of elements being in A except B.
    // ==> HINT : A - B
    // ==> {1.0, 2.0, 3.0} - {2.0, 4.0, 5.0, 6.0} equals {1.0, 3.0}
    public Set differ(Set set) {

    }

    // !! Do NOT modify this method !!
    // - Otherwise, any marks from this problem will not be given.
    public double[] getValueInArray() {
        return number;
    }

    // !! It is needed to implement. !!
    // ==> This method will return TRUE/FALSE depending on whether this set equals
    // to set Set or not.
    public boolean equals(Set set) {

    }

    // !! It is needed to implement. !!
    // ==> This method will return the String which shows the (sorted) list of
    // elements in this set.
    // ==> e.g. {1.0, 2.0, 3.5, 5.0}
    public String getStringValue() {

    }

    // !! Do NOT modify this method !!
    // - Otherwise, any marks from this problem will not be given.
    public void print() {
        System.out.println(getStringValue());
    }

    // !! It is needed to implement. !!
    // ==> This method will return the summation of all elements in this set.
    // ==> if you have {1.0, 2.0, 3.5, 5.0}, you will get 11.5.
    public static double sumAllNumberInSet(Set set) {

    }
}
