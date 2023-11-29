def overlap(l1,l2):
    l1_set = set(l1)
    l2_set = set(l2)
    if len(l1_set.intersection(l2_set))>0:
        return(l1_set.intersection(l2_set))
    else:
        return("no element is common")
    l1 = {1,2,3,4,5}
    l2 = {5,3,4,5,8}
    print(overlap,(l1,l2))

