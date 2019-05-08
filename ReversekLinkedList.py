class Node:
    def __init__(self,value):
        self.value = value
        self.link = None

class ReversekLinkedList:
    def __init__(self):
        self.head = None

    def newlist(self,n):
        for i in range(n):
            value = int(input("Element:"))
            self.insert(value)

    def insert(self, value):
        temp = Node(value)
        if self.head is None:
            self.head = temp
            return
        a = self.head
        while a.link is not None: a = a.link
        a.link = temp

    def reverseklist(self,k):
        x = 1
        a = self.head
        temp = None
        while x <= k:
            link = a.link
            if x == k: b = a.link
            #turning links
            a.link = temp
            temp = a
            a = link
            x += 1
        self.head = temp
        a = self.head
        while a.link is not None: a = a.link
        a.link = b

    def displaylist(self):
        if self.head is None: return
        else:
            a = self.head
            while a is not None:
                print(a.value),
                a = a.link
            print("\n")

list = ReversekLinkedList()
list.newlist(n = int(input("Number of nodes:")))
list.reverseklist(k = int(input("K:")))
list.displaylist()