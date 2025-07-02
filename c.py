# NUMBER 1
# class Car:
#     color='RED FLOWER'
#     name='FLOWER CAR'
#     type='FLOWER'
#     def changetype(self,c,t,n):
#         self.name=n
#         self.color=c
#         self.type=t
# c1=Car()
# c2=Car()
# c1.changetype('red','electric','FLOWER GUY')
# print(c1.name)
# print(c2.name)
# print(c2.color)

#NUMBER 2
# class Car:
#     name = 'Fortuner'
#     color = 'Red'
#     def __init__(self,n,c):
#         if n != None:
#             self.name=n
#         if c!= None:
#             self.color=c
#     def __init__(self) -> None:
#         pass
#     # def change(self,n,c):
#     #     if n != None:
#     #         self.name=n
#     #     if c!= None:
#     #         self.color=c
# c1 = Car()
# c2 = Car()
# print(c1.color,c1.name)
# # c2.change(None,'Blue')
# print(c2.color,c2.name)

# NUMBER 3
# create a  student class that takes name and marks of 3 subjects as arguments in a constructor.Then create a method to calculate the average
class Student:
    def __init__(self,name,maths,phy,chem):
        self.name=name
        self.maths=maths
        self.phy=phy
        self.chem=chem
        
    def avg(self):
        average=(self.maths+self.chem+self.phy)//3
        print('The average of student',self.name ,'is',average)

Student1=Student('JOHN',100,45,99)
Student1.avg()

