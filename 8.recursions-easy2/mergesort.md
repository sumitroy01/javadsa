                                mergesort([4,2,1,3])
                               /                     \
                   mergesort([4,2])              mergesort([1,3])
                   /           \                 /           \
         mergesort([4])   mergesort([2])   mergesort([1])  mergesort([3])
              |                |                |              |
             [4]              [2]              [1]            [3]
                   \          /                  \            /
                merge([4],[2])                  merge([1],[3])
                     = [2,4]                          = [1,3]
                            \                        /
                         merge([2,4],[1,3]) → [1,2,3,4]
