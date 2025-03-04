class Node:
    def __init__(self, data=None, next=None):
        self.date = data
        self.next = next

class LinkedList:
    def __init__(self):
        self.head = None

    def insert_at_begining(self, data):
        node = Node(data, self.head)
        self.head = node

    def insert_at_end(self, data):
        if self.head is None:
            self.head = Node(data, None)
            return
        
        itr = self.head
        while itr.next:
            itr = itr.next

        itr.next = Node(data, None)
        return


    def printList(self):
        if self.head is None:
            print("Linked is Empty")
            return
        
        itr = self.head
        llstr = ''

        while itr:
            llstr += str(itr.date) + '---> '
            itr = itr.next
        
        print(llstr)


    def insert_values(self, data_list):
        self.head = None
        for data in data_list:
            self.insert_at_end(data)
        
        return

if __name__ == '__main__':
    ll = LinkedList()
    ll.insert_at_begining(5)
    ll.insert_at_begining(89)
    ll.insert_at_end(79)
    ll.insert_at_end(69)
    ll.printList()

    ll2 = LinkedList()
    ll2.insert_values(['banana', 'mango', 'grapes', 'orange'])
    ll2.printList()
