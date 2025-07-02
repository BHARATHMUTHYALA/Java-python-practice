# def test(a=6,b=7):
#     print(a+b)
# test(123)

# class Test:
#     def __init__(self,a=None,b=None):
#         if a is None and b is None:
#             pass
#         elif b is None:
#             self.b=a
#         else:
#             self.a=a
#             self.b=b

#     # def callPrint(self,**args,*kwarg):
#         #     print(args)
#         #     print(kwarg)
# t1=Test()
# t2=Test(10)
# t3=Test(12,12)
# t1.callPrint(1,8,9,78,89,7,'Rriti',marks=8.9,age='27')
                                                                        #MRO
# class A:
#     def p(self):
#         print('A')
# class B:
#     def p(self):
#         A().p()
# B().p()

# class A:
#     def p(self):
#         print('A')
# class B(A):
#     def p(self):
#         super().p()
# B().p()

# class A:
#     def p(self):
#         print('A')
# class B:
#     def p(self):
#         print('B')
# B().p()
                                                                    # -END



