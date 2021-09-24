# A class to represent the adjacency list of node
class AdjNode:
    def __init__(self, data):
        self.vertex = data
        self.next = None;



class AdjacencyList:
    def __init__(self, vertexCount):
        # The self keyword is used to represent the instance of the class
        # It binds the attributes and methods of the class in Python
        #
        self.vertexCount = vertexCount
        self.graph = [None]*self.vertexCount

    # A utility function to add an edge from source to destination
    def addEdge(self, source, destination):
         # Adding the node to the source node
        node = AdjNode(dest)
        node.next = self.graph[src]
        self.graph[src] = node
  
        # Adding the source node to the destination as
        # it is the undirected graph
        node = AdjNode(src)
        node.next = self.graph[dest]
        self.graph[dest] = node



