package Lab7;

class List {
    private ListElement firstElement;
    private ListElement lastElement;

    public ListElement getFirstElement() {
        return firstElement;
    }

    void addToBeggining(Stones data) {
        ListElement a = new ListElement();
        a.data = data;
        if (firstElement == null) {
            firstElement = a;
            lastElement = a;
        } else {
            a.next = firstElement;
            firstElement = a;
        }
    }

    void addToEnding(Stones data) {
        ListElement a = new ListElement();
        a.data = (Stones) data;
        if (firstElement == null) {
            firstElement = a;
            lastElement = a;
        } else {
            ListElement b = firstElement;
            while (b.next != null) {
                b = b.next;
            }
            b.next = a;
            lastElement = a;
        }
    }

    void DeleteElement(Stones data) {
        if (firstElement == null)
            return;
        if (firstElement == lastElement) {
            firstElement = null;
            lastElement = null;
            return;
        }
        if (firstElement.data == data) {
            firstElement = firstElement.next;
            return;
        }
        ListElement t = firstElement;
        while (t.next != null) {
            if (t.next.data == data) {
                if (firstElement == t.next) {
                    firstElement = t;
                }
                t.next = t.next.next;
                return;
            }
            t = t.next;
        }
    }
}