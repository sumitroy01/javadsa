import single_linked_list.Linkdlist;

public class meregelinkdlist {
    public static Linkdlist mergesortedlist(Linkdlist first, Linkdlist second) {
    Linkdlist result = new Linkdlist();

    Node f = first.head;
    Node s = second.head;

    
    while (f != null && s != null) {
        if (f.value <= s.value) {
            result.insertLast(f.value);
            f = f.next;
        } else {
            result.insertLast(s.value);
            s = s.next;
        }
    }

    while (f != null) {
        result.insertLast(f.value);
        f = f.next;
    }

    while (s != null) {
        result.insertLast(s.value);
        s = s.next;
    }

    return result;
}

}
