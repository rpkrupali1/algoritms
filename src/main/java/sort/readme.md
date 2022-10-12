# Sorting Algorithms
Sorting algorithm is algorithm that rearranges given array/list in an order.

## Sorting Terminology

### In-place Sorting
In-place algorithm uses constant space to sort order, it does not use any auxiliary space. 
It sorts only by modifying the order of the elements within given array/list.

**Example:**
- Insertion Sort
- Selection Sort

### Internal Sorting
When all the data is placed in the *main memory* or *internal memory* then sorting ic called Internal Sorting.

**Example**
- Heap Sort
- Bubble Sort
- Selection Sort
- Quick Sort
- Insertion Sort

### External Sorting
When all data that needs to be sorted cannot be placed in memory at a time, the sorting is called external sorting

**Example**
- Merge Sort

### Stable Sorting
Stability is mainly essential when we have key-value pairs with duplicate keys possible.

A sorting algorithm is stable when two objects with equal keys appear in the same order in sorted output as they appear in the input data set.

![img.png](../../../images/stablesort.png)

**Example**
- Bubble sort
- Insertion sort
- Merge sort
- Counting sort

### UnStable Sorting
When two same data appear in different order in sorted data then it is called as Unstable sort.

**Example**
- Quick sort
- Heap sort

## Complexities
![img.png](../../../images/sort_complexities.png)

## Sorting Algorithms

### Selection Sort
Sort by finding the smallest element and putting in the beginning and then repeat the process.
Sorting by repeated selection is "Selection Sort".
- Design Strategy - `Brute Force`
- Stability - Default implementation is `not stable`. However, it can be made stable. 
- `In Place` algorithm
- Time complexity - **Ω(n<sup>2</sup>)**, **Θ(n<sup>2</sup>)**, **O(n<sup>2</sup>)** 
- Space Complexity - O(1) As the only extra space is used for temporary variables while swapping

#### Pseudo Code and complexity 

![](../../../images/Selection_sort_pseudo_code.png)

#### Logic Execution
![](../../../images/selection_sort.png)


### Bubble Sort
Works by repeatedly swapping adjacent elements if they are not in correct order.

This algorithm is not suitable for large data sets as its average and worst-case time complexity is quite high.
- Design Strategy - `Brute Force`
- `Stable` algorithm
- `In Place` algorithm
- Time complexity - **Ω(n<sup>2</sup>)**, **Θ(n<sup>2</sup>)**, **O(n<sup>2</sup>)**
- Space Complexity - O(1) As the only extra space is used for temporary variables while swapping

#### Pseudo Code and complexity 

![](../../../images/bubble_sort_pseudo.png)

#### Logic Execution
![](../../../images/bubble_sort_correct.png)

### Insertion Sort

Array is split into sorted and unsorted array. Values from unsorted part are picked and placed at correct position in sorted array.
Values from the unsorted part are picked and placed at the correct position in the sorted part.
Works similar to the way you sort playing cards.

Efficient for small data set.

And it is appropriate for data sets which are already partially sorted.

- Design Strategy - `Decrease and conquer`
- `Stable` algorithm
- `In Place` algorithm
- Time Complexity -  `Ω(n)`, Θ(n<sup>2</sup>), O(n<sup>2</sup>)
- Space Complexity - `O(1)`

#### Pseudo Code and complexity

![](../../../images/insertion_sort_pseudo.png)

#### Logic Execution

![](../../../images/insertion_sort.png)

### Merge Sort
Arrays in initially divided into two equal halves, and then they are combined in sorted array

Here array is recursively divided into two halves till the size becomes 1. 
Once size becomes 1 then it will merge back recursively till the complete array is merged.

Slower compared to the other sort algorithms for smaller tasks.

It goes through the whole process even if the array is sorted.

- Design Strategy - `Divide and conquer`
- `Stable` algorithm
- `NOT In Place` algorithm
- Time Complexity -  Ω(n log(n)), Θ(n log(n)), O(n log(n))
- space complexity - O(n)

#### Pseudo Code and complexity

![](../../../images/merge-sort_pseudo.png)

#### Logic Execution

![](../../../images/merge_sort.png)