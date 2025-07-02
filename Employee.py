class Employee():
    def __init__(self,name,dept,salary):
        self.name=name
        self.dept=name
        self.salary=salary

    def showDetails(self):
        l=[self.name,self.dept,self.salary]
        return l

class architect(Employee):
    def __init__(self,name,age):
        self.name=name
        self.age=age

a1=architect('emp1','x')
print(a1)