class Student:
    mmarks = 0
    smarks = 0
    pmarks = 0
    name = None
    average = 0
    def __init__(self,n,m1,m2,m3):
        self.name = n
        self.mmarks = m1
        self.smarks = m2
        self.pmarks = m3
    def avg(self):
        self.average =  (self.mmarks+self.smarks+self.pmarks)/3
s1 = Student('Krishna',98,90,87)
s2 = Student('Bharath',100,100,100)
s1.avg()
s2.avg()
print('The avg of',s2.name, 'is' ,round(s2.average,2))