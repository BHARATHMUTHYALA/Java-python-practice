class student:
    def __init__(self,name,l):
        self.name=name
        self.l=l

    def __gt__(self,s):
        if(sum(self.l)>sum(s.l)):
            return self.name
        else:
            return s.name

std1=student("std1",[1,2,6])
std2=student("std2",[1,3,4])
print(std1 > std2)